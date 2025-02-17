import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApartementsComponentComponent } from './apartements-component.component';

describe('ApartementsComponentComponent', () => {
  let component: ApartementsComponentComponent;
  let fixture: ComponentFixture<ApartementsComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ApartementsComponentComponent]
    });
    fixture = TestBed.createComponent(ApartementsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
