import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularRatingBarChildComponent } from './angular-rating-bar-child.component';

describe('AngularRatingBarChildComponent', () => {
  let component: AngularRatingBarChildComponent;
  let fixture: ComponentFixture<AngularRatingBarChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularRatingBarChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularRatingBarChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
