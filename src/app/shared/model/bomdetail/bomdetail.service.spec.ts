import { TestBed } from '@angular/core/testing';

import { BOMDetail } from './bomdetail';

describe('BomdetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BOMDetail = TestBed.get(BOMDetail);
    expect(service).toBeTruthy();
  });
});
