import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FoodItemsComponent } from './food-items/food-items.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FilterPipe } from 'src/Shared/filter.pipe';
import { HighlightDirective } from 'src/Shared/highlight.pipe';
import { BuyComponent } from './buy/buy.component';
import { HeaderComponent } from './header/header.component';
import { FinalComponent } from './final/final.component';
import { AdminComponent } from './admin/admin.component';
import { AddComponent } from './add/add.component';
import { AdpwdComponent } from './adpwd/adpwd.component';
import { AdditemComponent } from './additem/additem.component';
import { FooterComponent } from './footer/footer.component';
import { PayComponent } from './pay/pay.component';
import { SfooditemsComponent } from './sfooditems/sfooditems.component';
import { NheaderComponent } from './nheader/nheader.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FoodItemsComponent,
    AboutusComponent,
    ContactusComponent,
    LoginComponent,
    RegisterComponent,
    FilterPipe,
    HighlightDirective,
    BuyComponent,
    HeaderComponent,
    FinalComponent,
    AdminComponent,
    AddComponent,
    AdpwdComponent,
    AdditemComponent,
    FooterComponent,
    PayComponent,
    SfooditemsComponent,
    NheaderComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }