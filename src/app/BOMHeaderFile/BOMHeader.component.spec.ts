import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BOMHeaderComponent } from './BOMHeader.component';

describe('BikeheaderComponent', () => {
  let component: BOMHeaderComponent;
  let fixture: ComponentFixture<BOMHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BOMHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BOMHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
