// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.

export const environment = {
  production: false,
  self: 'http://46.101.7.84:9080',
  storage: {
    keyName: 'currentUser'
  },
  services: {
    bind: {
      apiUrl: 'http://46.101.7.84:9081/api/v1'
    }
  }
};
