import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BOMDetail {
  detailId:number;
  bomId:number;
  componentDesc:string;
  componentId:number;
  hasInnerBOM:boolean;
  materialDesc:string;
  materialId:number;
  quantity:number;
  uom:string;
}
