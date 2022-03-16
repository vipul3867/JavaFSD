import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddComponent } from './add/add.component';
import { AdditemComponent } from './additem/additem.component';
import { AdminComponent } from './admin/admin.component';
import { AdpwdComponent } from './adpwd/adpwd.component';
import { BuyComponent } from './buy/buy.component';
import { ContactusComponent } from './contactus/contactus.component';

import { FinalComponent } from './final/final.component';
import { FoodItemsComponent } from './food-items/food-items.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PayComponent } from './pay/pay.component';
import { RegisterComponent } from './register/register.component';
import { SfooditemsComponent } from './sfooditems/sfooditems.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'Fooditems',component:FoodItemsComponent},
  {path:'sFooditems',component:SfooditemsComponent},
  {path:'about',component:AboutusComponent},
  {path:'contact',component:ContactusComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'Fooditems/:id',component:BuyComponent},
  {path:'buy',component:BuyComponent},
 {path:'additem',component:AdditemComponent},
  {path:'final',component:FinalComponent},
  {path:'pay',component:PayComponent},
  {path:'addi',component:AdditemComponent},
  {path:'adpwd',component:AdpwdComponent},
  {path:'admin',component:AdminComponent},
  {path:'add',component:AddComponent},
   {path:'',component:HomeComponent},
  {path:'**',component:ContactusComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }