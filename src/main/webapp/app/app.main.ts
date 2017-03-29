import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { ProdConfig } from './blocks/config/prod.config';
import { Angular2AppAppModule } from './app.module';

ProdConfig();

if (module['hot']) {
    module['hot'].accept();
}

platformBrowserDynamic().bootstrapModule(Angular2AppAppModule);
