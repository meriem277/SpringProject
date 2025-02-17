import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HearderComponentComponent } from './hearder-component.component';

describe('HearderComponentComponent', () => {
  let component: HearderComponentComponent;
  let fixture: ComponentFixture<HearderComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HearderComponentComponent]
    });
    fixture = TestBed.createComponent(HearderComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
