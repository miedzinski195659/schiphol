package Model;

import java.util.Date;

/**
 * Created by lm on 17.05.2017.
 */
public class Flight {
    private String prefixICAO;

    private Date publicEstimatedOffBlockTime;

    private String aircraftRegistration;

    private String flightDirection;

    private Date expectedTimeBoarding;

    private String flightNumber;

    private String id;

    private Date expectedTimeGateClosing;

    private Date checkinAllocations;

    private String airlineCode;

    private String terminal;

    private Date transferPositions;

    private Codeshares codeshares;

    private String expectedTimeOnBelt;

    private BaggageClaim baggageClaim;

    private String estimatedLandingTime;

    private AircraftType aircraftType;

    private String serviceType;

    private String prefixIATA;

    private String scheduleTime;

    private String gate;

    private Date actualOffBlockTime;

    private String mainFlight;

    private PublicFlightState publicFlightState;

    private Date expectedTimeGateOpen;

    private Route route;

    private String scheduleDate;

    private String flightName;

    private String actualLandingTime;

    private String schemaVersion;

    public String getPrefixICAO() {
        return prefixICAO;
    }

    public void setPrefixICAO(String prefixICAO) {
        this.prefixICAO = prefixICAO;
    }

    public Date getPublicEstimatedOffBlockTime() {
        return publicEstimatedOffBlockTime;
    }

    public void setPublicEstimatedOffBlockTime(Date publicEstimatedOffBlockTime) {
        this.publicEstimatedOffBlockTime = publicEstimatedOffBlockTime;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    public String getFlightDirection() {
        return flightDirection;
    }

    public void setFlightDirection(String flightDirection) {
        this.flightDirection = flightDirection;
    }

    public Date getExpectedTimeBoarding() {
        return expectedTimeBoarding;
    }

    public void setExpectedTimeBoarding(Date expectedTimeBoarding) {
        this.expectedTimeBoarding = expectedTimeBoarding;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getExpectedTimeGateClosing() {
        return expectedTimeGateClosing;
    }

    public void setExpectedTimeGateClosing(Date expectedTimeGateClosing) {
        this.expectedTimeGateClosing = expectedTimeGateClosing;
    }

    public Date getCheckinAllocations() {
        return checkinAllocations;
    }

    public void setCheckinAllocations(Date checkinAllocations) {
        this.checkinAllocations = checkinAllocations;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Date getTransferPositions() {
        return transferPositions;
    }

    public void setTransferPositions(Date transferPositions) {
        this.transferPositions = transferPositions;
    }

    public Codeshares getCodeshares() {
        return codeshares;
    }

    public void setCodeshares(Codeshares codeshares) {
        this.codeshares = codeshares;
    }

    public String getExpectedTimeOnBelt() {
        return expectedTimeOnBelt;
    }

    public void setExpectedTimeOnBelt(String expectedTimeOnBelt) {
        this.expectedTimeOnBelt = expectedTimeOnBelt;
    }

    public BaggageClaim getBaggageClaim() {
        return baggageClaim;
    }

    public void setBaggageClaim(BaggageClaim baggageClaim) {
        this.baggageClaim = baggageClaim;
    }

    public String getEstimatedLandingTime() {
        return estimatedLandingTime;
    }

    public void setEstimatedLandingTime(String estimatedLandingTime) {
        this.estimatedLandingTime = estimatedLandingTime;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPrefixIATA() {
        return prefixIATA;
    }

    public void setPrefixIATA(String prefixIATA) {
        this.prefixIATA = prefixIATA;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Date getActualOffBlockTime() {
        return actualOffBlockTime;
    }

    public void setActualOffBlockTime(Date actualOffBlockTime) {
        this.actualOffBlockTime = actualOffBlockTime;
    }

    public String getMainFlight() {
        return mainFlight;
    }

    public void setMainFlight(String mainFlight) {
        this.mainFlight = mainFlight;
    }

    public PublicFlightState getPublicFlightState() {
        return publicFlightState;
    }

    public void setPublicFlightState(PublicFlightState publicFlightState) {
        this.publicFlightState = publicFlightState;
    }

    public Date getExpectedTimeGateOpen() {
        return expectedTimeGateOpen;
    }

    public void setExpectedTimeGateOpen(Date expectedTimeGateOpen) {
        this.expectedTimeGateOpen = expectedTimeGateOpen;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getActualLandingTime() {
        return actualLandingTime;
    }

    public void setActualLandingTime(String actualLandingTime) {
        this.actualLandingTime = actualLandingTime;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    @Override
    public String toString() {
        return "ClassPojo [prefixICAO = " + prefixICAO + ", publicEstimatedOffBlockTime = " + publicEstimatedOffBlockTime + ", aircraftRegistration = " + aircraftRegistration + ", flightDirection = " + flightDirection + ", expectedTimeBoarding = " + expectedTimeBoarding + ", flightNumber = " + flightNumber + ", id = " + id + ", expectedTimeGateClosing = " + expectedTimeGateClosing + ", checkinAllocations = " + checkinAllocations + ", airlineCode = " + airlineCode + ", terminal = " + terminal + ", transferPositions = " + transferPositions + ", codeshares = " + codeshares + ", expectedTimeOnBelt = " + expectedTimeOnBelt + ", baggageClaim = " + baggageClaim + ", estimatedLandingTime = " + estimatedLandingTime + ", aircraftType = " + aircraftType + ", serviceType = " + serviceType + ", prefixIATA = " + prefixIATA + ", scheduleTime = " + scheduleTime + ", gate = " + gate + ", actualOffBlockTime = " + actualOffBlockTime + ", mainFlight = " + mainFlight + ", publicFlightState = " + publicFlightState + ", expectedTimeGateOpen = " + expectedTimeGateOpen + ", route = " + route + ", scheduleDate = " + scheduleDate + ", flightName = " + flightName + ", actualLandingTime = " + actualLandingTime + ", schemaVersion = " + schemaVersion + "]";
    }
}
