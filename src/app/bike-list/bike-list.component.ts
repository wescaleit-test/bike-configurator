import { Component, OnInit } from '@angular/core';
import { BikeService} from '../shared/bike/bike.service';

@Component({
  selector: 'app-bike-list',
  templateUrl: './bike-list.component.html',
  styleUrls: ['./bike-list.component.scss']
})
export class BikeListComponent implements OnInit {

  bikeHeader: Array<any>;

  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    this.bikeService.getAllHeader().subscribe(data => {
      this.bikeHeader = data;
    });
  }

}
