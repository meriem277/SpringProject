import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApartementsByResidenceComponentComponent } from './apartements-by-residence-component.component';

describe('ApartementsByResidenceComponentComponent', () => {
  let component: ApartementsByResidenceComponentComponent;
  let fixture: ComponentFixture<ApartementsByResidenceComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ApartementsByResidenceComponentComponent]
    });
    fixture = TestBed.createComponent(ApartementsByResidenceComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
