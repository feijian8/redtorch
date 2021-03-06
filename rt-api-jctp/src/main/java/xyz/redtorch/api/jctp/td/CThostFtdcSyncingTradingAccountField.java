/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcSyncingTradingAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSyncingTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setFrozenSwap(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_set(swigCPtr, this, value);
  }

  public double getFrozenSwap() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_get(swigCPtr, this);
  }

  public void setRemainSwap(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_RemainSwap_set(swigCPtr, this, value);
  }

  public double getRemainSwap() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingTradingAccountField_RemainSwap_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingAccountField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSyncingTradingAccountField(), true);
  }

}
