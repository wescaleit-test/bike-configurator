import { TestBed } from '@angular/core/testing';

import { BOMHeader } from './bomheader';

describe('BomheaderService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BOMHeader = TestBed.get(BOMHeader);
    expect(service).toBeTruthy();
  });
});
