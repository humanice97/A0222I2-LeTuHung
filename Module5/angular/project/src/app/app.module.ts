import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CalculatorComponent } from './ss3-angular-overview/bai-tap/calculator/calculator.component';
import { AngularColorPickerAppComponent } from './ss3-angular-overview/bai-tap/angular-color-picker-app/angular-color-picker-app.component';
import {FontSizeEditorComponent} from "./ss3-angular-overview/thuc-hanh/font-size-editor/font-size-editor.component";
import {PetComponent} from "./ss3-angular-overview/thuc-hanh/pet/pet.component";
import {ProductComponent} from "./ss3-angular-overview/thuc-hanh/product/product.component";
import {ArticleComponent} from "./ss4-angular-component-and-template/bai-tap/article/article.component";
import { LikeComponent } from './ss4-angular-component-and-template/bai-tap/like/like.component';
import { NavbarComponent } from './ss4-angular-component-and-template/bai-tap/navbar/navbar.component';
import { FooterComponent } from './ss4-angular-component-and-template/bai-tap/footer/footer.component';
import { NameCardComponent } from './ss5-component-interaction/thuc-hanh/name-card/name-card.component';
import { ProgressBarComponent } from './ss5-component-interaction/thuc-hanh/progress-bar/progress-bar.component';
import { FuramaResortComponent } from './case-study/furama-resort/furama-resort.component';
import { AngularRatingBarComponent } from './ss5-component-interaction/bai-tap/angular-rating-bar/angular-rating-bar.component';
import { AngularRatingBarChildComponent } from './ss5-component-interaction/bai-tap/angular-rating-bar-child/angular-rating-bar-child.component';
import { CountDownComponent } from './ss5-component-interaction/bai-tap/count-down/count-down.component';
import { ToDoComponent } from './ss6-angular-form/thuc-hanh/to-do/to-do.component';
import { RegisterFormComponent } from './ss6-angular-form/bai-tap/register-form/register-form.component';
import { NavBarComponent } from './case-study/furama-resort/component/nav-bar/nav-bar.component';
import { EmployeeListComponent } from './case-study/furama-resort/component/employee/employee-list/employee-list.component';
import { CustomerListComponent } from './case-study/furama-resort/component/customer/customer-list/customer-list.component';
import { CreateCustomerComponent } from './case-study/furama-resort/component/customer/create-customer/create-customer.component';
import { CreateEmployeeComponent } from './case-study/furama-resort/component/employee/create-employee/create-employee.component';
import { FacilitiesComponent } from './case-study/furama-resort/component/facility/facilities/facilities.component';
import { FacilitiesDeleteComponent } from './case-study/furama-resort/component/facility/facilities-delete/facilities-delete.component';
import { FacilitiesEditComponent } from './case-study/furama-resort/component/facility/facilities-edit/facilities-edit.component';
import { HomePageComponent } from './case-study/furama-resort/component/home/home-page/home-page.component';
import { CustomerEditComponent } from './case-study/furama-resort/component/customer/customer-edit/customer-edit.component';
import { CustomerDeleteComponent } from './case-study/furama-resort/component/customer/customer-delete/customer-delete.component';
import { DictionaryComponent } from './ss7-service-router/bai-tap/dictionary/component/dictionary/dictionary.component';
import { TranslateComponent } from './ss7-service-router/bai-tap/dictionary/component/translate/translate.component';


@NgModule({
  declarations: [
    AppComponent,
    CalculatorComponent,
    AngularColorPickerAppComponent,
    FontSizeEditorComponent,
    PetComponent,
    ProductComponent,
    ArticleComponent,
    LikeComponent,
    NavbarComponent,
    FooterComponent,
    NameCardComponent,
    ProgressBarComponent,
    FuramaResortComponent,
    AngularRatingBarComponent,
    AngularRatingBarChildComponent,
    CountDownComponent,
    ToDoComponent,
    RegisterFormComponent,
    NavBarComponent,
    EmployeeListComponent,
    CustomerListComponent,
    CreateCustomerComponent,
    CreateEmployeeComponent,
    FacilitiesComponent,
    FacilitiesDeleteComponent,
    FacilitiesEditComponent,
    HomePageComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,
    DictionaryComponent,
    TranslateComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
