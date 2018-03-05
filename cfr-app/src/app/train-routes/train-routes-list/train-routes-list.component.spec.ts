import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainRoutesListComponent } from './train-routes-list.component';

describe('TrainRoutesListComponent', () => {
  let component: TrainRoutesListComponent;
  let fixture: ComponentFixture<TrainRoutesListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainRoutesListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainRoutesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
