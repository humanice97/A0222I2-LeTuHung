import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {FacilitiesComponent} from "./case-study/furama-resort/component/facility/facilities/facilities.component";
import {
  CustomerListComponent
} from "./case-study/furama-resort/component/customer/customer-list/customer-list.component";
import {HomePageComponent} from "./case-study/furama-resort/component/home/home-page/home-page.component";
import {DictionaryComponent} from "./ss7-service-router/bai-tap/dictionary/component/dictionary/dictionary.component";
import {TranslateComponent} from "./ss7-service-router/bai-tap/dictionary/component/translate/translate.component";
import {
  CreateCustomerComponent
} from "./case-study/furama-resort/component/customer/create-customer/create-customer.component";
import {
  CustomerDeleteComponent
} from "./case-study/furama-resort/component/customer/customer-delete/customer-delete.component";
import {
  CustomerEditComponent
} from "./case-study/furama-resort/component/customer/customer-edit/customer-edit.component";
import {ProductListComponent} from "./ss7-service-router/bai-tap/product/component/product-list/product-list.component";
import {
  ProductCreateComponent
} from "./ss7-service-router/bai-tap/product/component/product-create/product-create.component";
import {
  ProductUpdateComponent
} from "./ss7-service-router/bai-tap/product/component/product-update/product-update.component";


const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'facility', component: FacilitiesComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'dictionary', component: DictionaryComponent},
  {path: 'dictionary/:word', component: TranslateComponent},
  {path: 'customer/edit/:id', component: CustomerEditComponent},
  {path: 'customer/delete/:id', component: CustomerDeleteComponent},
  {path: 'create', component: CreateCustomerComponent},
  {path: 'product',component: ProductListComponent},
  {path: 'product/create-product', component: ProductCreateComponent},
  {path: 'product/update/:id',component:ProductUpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
