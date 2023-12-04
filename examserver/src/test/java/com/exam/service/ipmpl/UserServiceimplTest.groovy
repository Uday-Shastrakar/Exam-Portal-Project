package com.exam.service.ipmpl

import com.exam.helper.UserFoundException
import com.exam.model.User
import com.exam.model.UserRole
import com.exam.repo.RoleRepository
import com.exam.repo.UserRepository
import spock.lang.Specification

import javax.management.relation.Role

class UserServiceimplTest extends Specification {
    UserServiceimpl service
    def userRepository
    def roleRepository
    void setup() {
        userRepository = Mock(UserRepository)
        roleRepository = Mock(RoleRepository)
        service = new UserServiceimpl(userRepository: userRepository,)
    }

    def "Test for createUser if user with username already exists" (){
        given:
        User user = new User(id: 1,username: "user")
        when:
        service.createUser(user,new HashSet<UserRole>())
        then:
        1 == 1
        1 * userRepository.findByUsername(_) >> new User()
        thrown(UserFoundException)
    }

//    def "Test for createUser if user with username not exists" (){
//        given:
//        def userRole = new HashSet<UserRole>()
//        def user = new User()
//        def role = new com.exam.model.Role()
//
//        userRole.add(new UserRole(userRoleId: 1,user:user,role:role))
//        when:
//        service.createUser(user,userRole)
//        then:
//        1 == 1
//        1 * userRepository.findByUsername(_) >> null
//        1 * roleRepository.save(_) >> new com.exam.model.Role()
//    }
}
