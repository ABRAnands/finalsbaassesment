import { Pipe, PipeTransform, Injectable } from '@angular/core';
import { User } from '../model/user';

@Pipe({
  name: 'userFilter'
})

@Injectable()
export class UserPipe implements PipeTransform {

  transform(users: Array<User>, filterByUser?: any) {
    if (filterByUser) {
        users = users.filter(user =>
        user.firstName.toUpperCase().includes(filterByUser.toUpperCase())
        || user.lastName.toUpperCase().includes(filterByUser.toUpperCase())
        || user.employeeId == filterByUser);
    }
    return users;
  }

}
