import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { User } from '../model/user';

@Injectable({ providedIn: 'root' })
export class UserService {
    private staticURL:String = "http://bom-configuration-service.us-east-2.elasticbeanstalk.com";
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(this.staticURL+'/users');
    }
    register(user: User) {
        return this.http.post(this.staticURL+'/users', user);
    }
    delete(id: number) {
        return this.http.delete(this.staticURL+'/users/' + id);
    }
}