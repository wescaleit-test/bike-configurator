import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BikeService {

  private staticURL:String = "http://bom-configuration-service.us-east-2.elasticbeanstalk.com";
  constructor(private http: HttpClient){ 
  }
  getAllHeader(): Observable<any> {
    // var headers_object = new HttpHeaders();
    // headers_object.append('Content-Type', 'application/json');
    // headers_object.append("Authorization", "Basic " + btoa("john123:password"));


      const httpOptions = {
        // headers: new HttpHeaders({
        //   'username': 'john123',
        //   'password':'password'
        // })
        // headers: headers_object
      };
    //return this.http.get('//localhost:8080/bomHeader',httpOptions);
    return this.http.get(this.staticURL+'/bomHeader');
  }
  getHeader(bomId:any): Observable<any> {
    return this.http.get(this.staticURL+'/bomHeader/'+bomId);
  }
  getDetails(headerBOMID:String): Observable<any> {
    return this.http.get(this.staticURL+'/bomDetails/'+headerBOMID+'/details');
  }
  getAllDetails(bomHeaderId:any): Observable<any> {
    return this.http.get(this.staticURL+'/bomHeader/'+bomHeaderId);
  }
}

