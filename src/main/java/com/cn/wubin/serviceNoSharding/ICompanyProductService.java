//package com.cn.wubin.serviceNoSharding;
//
//import com.rongdu.cashloan.cl.domain.CompanyProdDetail;
//
//import java.util.List;
//import java.util.Map;
//
//public interface ICompanyProductService {
//
//    void saveOrUpdate(CompanyProdDetail companyProdDetail) throws Exception;
//
//    Map<String, Object> listHomeBdata();
//
//    List<CompanyProdDetail> listCompanyprodDetail(CompanyProdDetail companyProdDetail);
//
//    Long getProdClickNum(String userId, String proc_id);
//
//    List<CompanyProdDetail> getCompanyproductAuditList();
//
//    List<CompanyProdDetail> getAllList(String searchParams, int current, int pageSize);
//
//    List<CompanyProdDetail> selectAllStateList(Long userId, Integer auditState);
//
//    void serviceAudit(String data);
//
//    void updateProdClickNum();
//}
