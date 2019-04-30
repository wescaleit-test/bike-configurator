import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs/operators';
import { forkJoin } from "rxjs";
import { Observable } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

import { User } from '../shared/model/user';
import {BOMHeader}  from '../shared/model/bomheader/bomheader';
import {BOMDetail}  from '../shared/model/bomdetail/bomdetail';


import { BikeService } from '../shared/bike/bike.service';

@Component({    
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
    currentUser: User;
    users: User[] = [];
    bomHeaders : BOMHeader[]=[];
    bomDetails : BOMDetail[]=[];
    homeworld: Observable<{}>;
    constructor(private bikeService: BikeService) {
        
    }

    ngOnInit() {
        this.loadAllHeader();
    }

    deleteUser(id: number) {
        // this.userService.delete(id).pipe(first()).subscribe(() => { 
        //     this.loadAllUsers() 
        // });
    }
    public getClickedDetail(clickedBomId:string){
        this.bikeService.getDetails(clickedBomId).subscribe(bomDetails => { 
            this.bomDetails = bomDetails;                    
        }); 
    }
    private loadAllHeader() {
        //  this.bikeService.getAllHeader().pipe(first()).subscribe(bomHeaders => { 
        //     this.bomHeaders = bomHeaders; 
        //  });
        //  this.bikeService.getDetails('1001').pipe(first()).subscribe(bomDetails => { 
        //     this.bomDetails = bomDetails; 
        // }); 
        
        var that = this;
        this.bikeService.getAllHeader().subscribe(bomHeaders => { 
            this.bomHeaders = bomHeaders; 
            this.bikeService.getDetails(bomHeaders[0].bomId).subscribe(bomDetails => { 
                    that.bomDetails = bomDetails;                    
                });                 
             });
        

        // let character = this.bikeService.getAllHeader();
        // let characterHomeworld = this.bikeService.getDetails("1001");
        // forkJoin([character, characterHomeworld]).subscribe(results => {
        //     this.bomHeaders = results[0];
        //     this.bomDetails = results[1];
        //   });


        //   this.homeworld = this.bikeService.getAllHeader().pipe(
        //     mergeMap(bomDetails => this.bikeService.getDetails("1001"))
        //   );
    }
}