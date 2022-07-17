package exam_module_2.services;

import exam_module_2.utils.expception.DuplicatePersonnalRecordExpception;

public interface ImpNhanSu {
     void themNhanVien() throws DuplicatePersonnalRecordExpception;
     void themHocVien() throws DuplicatePersonnalRecordExpception;
     void danhSachNhanSu();
     void xoaNhanSu();
}
