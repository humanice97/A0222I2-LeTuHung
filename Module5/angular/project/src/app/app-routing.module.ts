import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {FacilitiesComponent} from "./case-study/furama-resort/component/facility/facilities/facilities.component";
import {
  CustomerListComponent
} from "./case-study/furama-resort/component/customer/customer-list/customer-list.component";
import {HomePageComponent} from "./case-study/furama-resort/component/home/home-page/home-page.component";
import {DictionaryComponent} from "./ss7-service-router/bai-tap/dictionary/component/dictionary/dictionary.component";
import {TranslateComponent} from "./ss7-service-router/bai-tap/dictionary/component/translate/translate.component";


const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'facility', component: FacilitiesComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'dictionary', component: DictionaryComponent},
  {path: 'dictionary/:word', component: TranslateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
