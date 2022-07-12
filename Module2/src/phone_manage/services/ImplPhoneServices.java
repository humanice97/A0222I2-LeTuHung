package phone_manage.services;

import phone_manage.utils.validate.CheckSearchException;

public interface ImplPhoneServices {
    void addNewHandedPhone();
    void addNewGenuinePhone();
    void deletePhoneById();
    void displayPhone();
    void searchPhoneByName() throws CheckSearchException;
}
