import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { CalculatorComponent } from './ss3_angular-overview/bai-tap/calculator/calculator.component';
import { AngularColorPickerAppComponent } from './ss3_angular-overview/bai-tap/angular-color-picker-app/angular-color-picker-app.component';
import {FontSizeEditorComponent} from "./ss3_angular-overview/thuc-hanh/font-size-editor/font-size-editor.component";
import {PetComponent} from "./ss3_angular-overview/thuc-hanh/pet/pet.component";
import {ProductComponent} from "./ss3_angular-overview/thuc-hanh/product/product.component";

@NgModule({
  declarations: [
    AppComponent,
    CalculatorComponent,
    AngularColorPickerAppComponent,
    FontSizeEditorComponent,
    PetComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
