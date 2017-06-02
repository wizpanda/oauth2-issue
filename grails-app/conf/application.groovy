

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.test.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.test.UserRole'
grails.plugin.springsecurity.authority.className = 'com.test.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]



// Added by the Spring Security OAuth2 Provider plugin:
grails.plugin.springsecurity.oauthProvider.clientLookup.className = 'com.test.Client'
grails.plugin.springsecurity.oauthProvider.authorizationCodeLookup.className = 'com.test.AuthorizationCode'
grails.plugin.springsecurity.oauthProvider.accessTokenLookup.className = 'com.test.AccessToken'
grails.plugin.springsecurity.oauthProvider.refreshTokenLookup.className = 'com.test.RefreshToken'

