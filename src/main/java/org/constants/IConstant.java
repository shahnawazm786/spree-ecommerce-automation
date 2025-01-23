package org.constants;

public interface IConstant {

    final String BASE_MAIN_RESOURCE=System.getProperty("user.dir")+"/src/main/resources/";
    final String MAIN_DATA_FILE=BASE_MAIN_RESOURCE+"DataFiles/";
    final String MAIN_PROPERTIES_FILE=BASE_MAIN_RESOURCE+"properties/";
    final String MAIN_EXCEL_FILE=BASE_MAIN_RESOURCE+"excel/";
    final String MAIN_CSV_FILE=BASE_MAIN_RESOURCE+"csv/";
    final String MAIN_JSON_FILE=BASE_MAIN_RESOURCE+"json/";
    final String BASE_TEST_RESOURCE=System.getProperty("user.dir")+"/src/test/resources/";
    final String TEST_DATA_FILE=BASE_TEST_RESOURCE+"DataFiles/";
    final String TEST_PROPERTIES_FILE=BASE_TEST_RESOURCE+"properties/";
    final String TEST_EXCEL_FILE=BASE_TEST_RESOURCE+"excel/";
    final String TEST_CSV_FILE=BASE_TEST_RESOURCE+"csv/";
    final String TEST_JSON_FILE=BASE_TEST_RESOURCE+"json/";

}
