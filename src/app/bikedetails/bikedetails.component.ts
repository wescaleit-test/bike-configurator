import { Component, OnInit } from '@angular/core';
import { BikeService} from '../shared/bike/bike.service';

@Component({
  selector: 'app-bikedetails',
  templateUrl: './bikedetails.component.html',
  styleUrls: ['./bikedetails.component.scss']
})
export class BikedetailsComponent implements OnInit {
  bikeDetails: Array<any>;

  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    this.bikeService.getDetails('').subscribe(data => {
      this.bikeDetails = data;
    });
  }

}
