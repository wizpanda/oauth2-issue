package test330m2

import com.test.Client

class BootStrap {

    def init = { servletContext ->
        Client(clientId: 'my-client',
                authorizedGrantTypes: ['authorization_code', 'refresh_token', 'implicit', 'password', 'client_credentials'],
                authorities: ['ROLE_CLIENT'],
                scopes: ['read', 'write'],
                redirectUris: ['http://localhost:8080']
        ).save(flush: true)

    }
    def destroy = {
    }
}
