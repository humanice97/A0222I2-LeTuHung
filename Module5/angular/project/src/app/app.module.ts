import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
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
    FuramaResortComponent
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
