import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ib.client.*;

public class Controller implements EWrapper{
	
	private final ClientHandler.ILogger m_inlogger = new ClientHandler.ILogger() {
		@Override
		public void log(String x) {
			
		}
	};
	
	private final ClientHandler.ILogger m_outlogger = new ClientHandler.ILogger() {
		@Override
		public void log(String x) {
			
		}
	};
	
	// Signal Reader
	static EJavaSignal readerSignal = new EJavaSignal();
	
	// ClientHandler (eClientSocket)
	public ClientHandler eClientSocket;
	
	public Controller() {
		super();
		this.eClientSocket = new ClientHandler(this, this.m_inlogger, this.m_outlogger);
	}

	@Override
	public void accountDownloadEnd(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountSummary(int arg0, String arg1, String arg2, String arg3, String arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountSummaryEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountUpdateMulti(int arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountUpdateMultiEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bondContractDetails(int arg0, ContractDetails arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commissionReport(CommissionReport arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completedOrder(Contract arg0, Order arg1, OrderState arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completedOrdersEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectAck() {
		
		System.out.println("Connected");
		
	}

	@Override
	public void connectionClosed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contractDetails(int arg0, ContractDetails arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contractDetailsEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currentTime(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deltaNeutralValidation(int arg0, DeltaNeutralContract arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGroupList(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGroupUpdated(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Exception arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(int arg0, int arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execDetails(int arg0, Contract arg1, Execution arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execDetailsEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void familyCodes(FamilyCode[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fundamentalData(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void headTimestamp(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void histogramData(int arg0, List<HistogramEntry> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalData(int arg0, Bar arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalDataEnd(int arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalDataUpdate(int arg0, Bar arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalNews(int arg0, String arg1, String arg2, String arg3, String arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalNewsEnd(int arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalSchedule(int arg0, String arg1, String arg2, String arg3, List<HistoricalSession> arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalTicks(int arg0, List<HistoricalTick> arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalTicksBidAsk(int arg0, List<HistoricalTickBidAsk> arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historicalTicksLast(int arg0, List<HistoricalTickLast> arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managedAccounts(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marketDataType(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marketRule(int arg0, PriceIncrement[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mktDepthExchanges(DepthMktDataDescription[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newsArticle(int arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newsProviders(NewsProvider[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextValidId(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openOrder(int arg0, Contract arg1, Order arg2, OrderState arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openOrderEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderBound(long arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderStatus(int arg0, String arg1, Decimal arg2, Decimal arg3, double arg4, int arg5, int arg6,
			double arg7, int arg8, String arg9, double arg10) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pnl(int arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pnlSingle(int arg0, Decimal arg1, double arg2, double arg3, double arg4, double arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void position(String arg0, Contract arg1, Decimal arg2, double arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void positionEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void positionMulti(int arg0, String arg1, String arg2, Contract arg3, Decimal arg4, double arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void positionMultiEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realtimeBar(int arg0, long arg1, double arg2, double arg3, double arg4, double arg5, Decimal arg6,
			Decimal arg7, int arg8) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveFA(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replaceFAEnd(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rerouteMktDataReq(int arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rerouteMktDepthReq(int arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scannerData(int arg0, int arg1, ContractDetails arg2, String arg3, String arg4, String arg5,
			String arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scannerDataEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scannerParameters(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void securityDefinitionOptionalParameter(int arg0, String arg1, int arg2, String arg3, String arg4,
			Set<String> arg5, Set<Double> arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void securityDefinitionOptionalParameterEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smartComponents(int arg0, Map<Integer, Entry<String, Character>> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void softDollarTiers(int arg0, SoftDollarTier[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void symbolSamples(int arg0, ContractDescription[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickByTickAllLast(int arg0, int arg1, long arg2, double arg3, Decimal arg4, TickAttribLast arg5,
			String arg6, String arg7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickByTickBidAsk(int arg0, long arg1, double arg2, double arg3, Decimal arg4, Decimal arg5,
			TickAttribBidAsk arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickByTickMidPoint(int arg0, long arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickEFP(int arg0, int arg1, double arg2, String arg3, double arg4, int arg5, String arg6, double arg7,
			double arg8) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickGeneric(int arg0, int arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickNews(int arg0, long arg1, String arg2, String arg3, String arg4, String arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickOptionComputation(int arg0, int arg1, int arg2, double arg3, double arg4, double arg5, double arg6,
			double arg7, double arg8, double arg9, double arg10) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickPrice(int arg0, int arg1, double arg2, TickAttrib arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickReqParams(int arg0, double arg1, String arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickSize(int arg0, int arg1, Decimal arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickSnapshotEnd(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickString(int arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccountTime(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccountValue(String arg0, String arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMktDepth(int arg0, int arg1, int arg2, int arg3, double arg4, Decimal arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMktDepthL2(int arg0, int arg1, String arg2, int arg3, int arg4, double arg5, Decimal arg6,
			boolean arg7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNewsBulletin(int arg0, int arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePortfolio(Contract arg0, Decimal arg1, double arg2, double arg3, double arg4, double arg5,
			double arg6, String arg7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userInfo(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndAuthCompleted(boolean arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndAuthMessageAPI(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyCompleted(boolean arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMessageAPI(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wshEventData(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wshMetaData(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

}
