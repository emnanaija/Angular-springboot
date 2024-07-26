import { TestBed } from '@angular/core/testing';

import { PersonserviceService } from './personservice.service';

describe('PersonserviceService', () => {
  let service: PersonserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PersonserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
