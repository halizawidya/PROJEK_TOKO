package id.co.projek_toko.constant;

public class CustomerConstant {
    public static final String mNotFound = "Customer not found";
    public static final String mEmptyData = "No data available";
    public static final String mCreateSuccess = "Customer created successfully";
    public static final String mCreateFailed = "Failed to create Customer";
    public static final String mUpdateSuccess = "Customer updated Sucessfully";
    public static final String mUpdateFailed = "Failed to update Customer";
    public static final String mDeleteSuccess = "Customer deleted successfully";
    public static final String mDeleteFailed = "Failed to delete Customer";
    public static final String qAllDataActive = "SELECT * FROM ms_customer WHERE cst_status = ?1";
}
