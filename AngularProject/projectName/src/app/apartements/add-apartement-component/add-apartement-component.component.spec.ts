import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddApartementComponentComponent } from './add-apartement-component.component';

describe('AddApartementComponentComponent', () => {
  let component: AddApartementComponentComponent;
  let fixture: ComponentFixture<AddApartementComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddApartementComponentComponent]
    });
    fixture = TestBed.createComponent(AddApartementComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
