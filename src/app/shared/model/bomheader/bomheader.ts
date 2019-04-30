import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BOMHeader {
  bomId:number;
  bomGroupDesc:string;
  bomGroupId:number;
  bomType:string;
  bomUsage:string;
  plantid:number;
  plantDesc:string; 
}
