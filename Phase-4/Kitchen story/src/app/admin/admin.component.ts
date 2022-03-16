import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { efood } from '../food-items/food-items';
import { foodservice } from '../food-items/food-items.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  imgWidth = "100";
  imgHeight = "100";
  imgRadius = "20";
  vtbl: efood[] = [];
  temp: efood;
  adminUserName: string;
  adminPassword: string;
  adminLoggedIn : boolean;
  showAddItemForm : boolean;
  adminPage : boolean;
  Item: number;
  Name: string;
  Cost: number;
  Rating: number;
  qnt: number;
  Img: string;



  constructor(private route: Router, private aroute: ActivatedRoute, private utservice: foodservice) {
    this.adminLoggedIn = true;
    this.showAddItemForm = false;
    this.adminPage = false;
    this.vtbl =  [
      // {
      //   "Item": 1,
      //   "Name": "Biriyani",
      //   "Cost": 150,
      //   "Rating": 5.0,
      //   "qnt": 1,
      //   "Img": "assets/ChickenBiryani.jpg",
      // },
      // {
      //   "Item": 2,
      //   "Name": "Idly",
      //   "Cost": 50,
      //   "Rating": 4.8,
      //   "qnt": 1,
      //   "Img": "assets/idly.jpg"
      // },
      // {
      //   "Item": 3,
      //   "Name": "Puri",
      //   "Cost": 75,
      //   "Rating": 5.0,
      //   "qnt": 1,
      //   "Img": "assets/puri.jpg"
      // },
      // {
      //   "Item": 4,
      //   "Name": "Pizza",
      //   "Cost": 300,
      //   "Rating": 4.5,
      //   "qnt": 1,
      //   "Img": "assets/pizza.jpg"
      // },
      
    ];
  }

  ngOnInit(): void {
    this.vtbl = this.utservice.getFood();

  }
  deleteItem(name: string) {
    const index = this.vtbl.findIndex(
      item => item.Name === name
    )
    if (index >= 0) {
      this.vtbl.splice(index, 1);
    }
  }

  adminLogin() {
    if (this.adminPassword === 'admin' && this.adminUserName === 'admin') {
      this.adminPage = true;
      this.adminLoggedIn = false;
      this.route.navigate(['/admin']);
    } else {
      alert("Invalid credentials");
    }
  }

  onDelete(name: string) {
    if (window.confirm("delete")) {
      this.deleteItem(name);
      this.route.navigate(['/admin']);
    }
  }
 
  addItem(){
    // if(this.adminLoggedIn){
      this.showAddItemForm = true;
      this.adminLoggedIn = false;
      this.adminPage = false;
      this.route.navigate(['/admin']);
   // }
  }

  adminItemToList(){
   this.temp = {
    "Item": this.Item,
    "Name": this.Name,
    "Cost": this.Cost,
    "Rating": this.Rating,
    "qnt": this.qnt,
    "Img": this.Img
   }
    this.vtbl.push(this.temp);
    this.showAddItemForm = false;
    this.adminLoggedIn = false;
    this.adminPage = true;
    this.route.navigate(['/admin']);
  }
}


