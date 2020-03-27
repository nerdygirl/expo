import { ProxyNativeModule } from '@unimodules/core';
import { NotificationRequest } from './NotificationPresenter.types';
export interface NotificationPresenterModule extends ProxyNativeModule {
    presentNotificationAsync: (identifier: string, notificationRequest: NotificationRequest) => Promise<void>;
    dismissNotificationAsync: (identifier: string) => Promise<void>;
    dismissAllNotificationsAsync: () => Promise<void>;
}
declare const _default: NotificationPresenterModule;
export default _default;
