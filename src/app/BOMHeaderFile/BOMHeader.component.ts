import { Component, OnInit } from '@angular/core';
import { BikeService} from '../shared/bike/bike.service';
import { BOMHeader } from '../shared/model/bomheader/bomheader';

@Component({
  selector: 'app-bomheader',
  templateUrl: './BOMHeader.component.html',
  styleUrls: ['./BOMHeader.component.scss']
})
export class BOMHeaderComponent implements OnInit {
  bikeHeader: Array<BOMHeader>;
  selectedBOMId: BOMHeader;

  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    this.bikeService.getAllHeader().subscribe(data => {
      this.bikeHeader = data;
    });
  }
  onSelect(bomHeader: BOMHeader): void {
    this.selectedBOMId = bomHeader;
    console.log("Bom Selected : "+bomHeader.bomId + " of plant "+bomHeader.plantDesc);
  }

}
