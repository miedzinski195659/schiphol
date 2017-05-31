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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (prefixICAO != null ? !prefixICAO.equals(flight.prefixICAO) : flight.prefixICAO != null) return false;
        if (publicEstimatedOffBlockTime != null ? !publicEstimatedOffBlockTime.equals(flight.publicEstimatedOffBlockTime) : flight.publicEstimatedOffBlockTime != null)
            return false;
        if (aircraftRegistration != null ? !aircraftRegistration.equals(flight.aircraftRegistration) : flight.aircraftRegistration != null)
            return false;
        if (flightDirection != null ? !flightDirection.equals(flight.flightDirection) : flight.flightDirection != null)
            return false;
        if (expectedTimeBoarding != null ? !expectedTimeBoarding.equals(flight.expectedTimeBoarding) : flight.expectedTimeBoarding != null)
            return false;
        if (flightNumber != null ? !flightNumber.equals(flight.flightNumber) : flight.flightNumber != null)
            return false;
        if (id != null ? !id.equals(flight.id) : flight.id != null) return false;
        if (expectedTimeGateClosing != null ? !expectedTimeGateClosing.equals(flight.expectedTimeGateClosing) : flight.expectedTimeGateClosing != null)
            return false;
        if (checkinAllocations != null ? !checkinAllocations.equals(flight.checkinAllocations) : flight.checkinAllocations != null)
            return false;
        if (airlineCode != null ? !airlineCode.equals(flight.airlineCode) : flight.airlineCode != null) return false;
        if (terminal != null ? !terminal.equals(flight.terminal) : flight.terminal != null) return false;
        if (transferPositions != null ? !transferPositions.equals(flight.transferPositions) : flight.transferPositions != null)
            return false;
        if (codeshares != null ? !codeshares.equals(flight.codeshares) : flight.codeshares != null) return false;
        if (expectedTimeOnBelt != null ? !expectedTimeOnBelt.equals(flight.expectedTimeOnBelt) : flight.expectedTimeOnBelt != null)
            return false;
        if (baggageClaim != null ? !baggageClaim.equals(flight.baggageClaim) : flight.baggageClaim != null)
            return false;
        if (estimatedLandingTime != null ? !estimatedLandingTime.equals(flight.estimatedLandingTime) : flight.estimatedLandingTime != null)
            return false;
        if (aircraftType != null ? !aircraftType.equals(flight.aircraftType) : flight.aircraftType != null)
            return false;
        if (serviceType != null ? !serviceType.equals(flight.serviceType) : flight.serviceType != null) return false;
        if (prefixIATA != null ? !prefixIATA.equals(flight.prefixIATA) : flight.prefixIATA != null) return false;
        if (scheduleTime != null ? !scheduleTime.equals(flight.scheduleTime) : flight.scheduleTime != null)
            return false;
        if (gate != null ? !gate.equals(flight.gate) : flight.gate != null) return false;
        if (actualOffBlockTime != null ? !actualOffBlockTime.equals(flight.actualOffBlockTime) : flight.actualOffBlockTime != null)
            return false;
        if (mainFlight != null ? !mainFlight.equals(flight.mainFlight) : flight.mainFlight != null) return false;
        if (publicFlightState != null ? !publicFlightState.equals(flight.publicFlightState) : flight.publicFlightState != null)
            return false;
        if (expectedTimeGateOpen != null ? !expectedTimeGateOpen.equals(flight.expectedTimeGateOpen) : flight.expectedTimeGateOpen != null)
            return false;
        if (route != null ? !route.equals(flight.route) : flight.route != null) return false;
        if (scheduleDate != null ? !scheduleDate.equals(flight.scheduleDate) : flight.scheduleDate != null)
            return false;
        if (flightName != null ? !flightName.equals(flight.flightName) : flight.flightName != null) return false;
        if (actualLandingTime != null ? !actualLandingTime.equals(flight.actualLandingTime) : flight.actualLandingTime != null)
            return false;
        return schemaVersion != null ? schemaVersion.equals(flight.schemaVersion) : flight.schemaVersion == null;
    }

    @Override
    public int hashCode() {
        int result = prefixICAO != null ? prefixICAO.hashCode() : 0;
        result = 31 * result + (publicEstimatedOffBlockTime != null ? publicEstimatedOffBlockTime.hashCode() : 0);
        result = 31 * result + (aircraftRegistration != null ? aircraftRegistration.hashCode() : 0);
        result = 31 * result + (flightDirection != null ? flightDirection.hashCode() : 0);
        result = 31 * result + (expectedTimeBoarding != null ? expectedTimeBoarding.hashCode() : 0);
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (expectedTimeGateClosing != null ? expectedTimeGateClosing.hashCode() : 0);
        result = 31 * result + (checkinAllocations != null ? checkinAllocations.hashCode() : 0);
        result = 31 * result + (airlineCode != null ? airlineCode.hashCode() : 0);
        result = 31 * result + (terminal != null ? terminal.hashCode() : 0);
        result = 31 * result + (transferPositions != null ? transferPositions.hashCode() : 0);
        result = 31 * result + (codeshares != null ? codeshares.hashCode() : 0);
        result = 31 * result + (expectedTimeOnBelt != null ? expectedTimeOnBelt.hashCode() : 0);
        result = 31 * result + (baggageClaim != null ? baggageClaim.hashCode() : 0);
        result = 31 * result + (estimatedLandingTime != null ? estimatedLandingTime.hashCode() : 0);
        result = 31 * result + (aircraftType != null ? aircraftType.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + (prefixIATA != null ? prefixIATA.hashCode() : 0);
        result = 31 * result + (scheduleTime != null ? scheduleTime.hashCode() : 0);
        result = 31 * result + (gate != null ? gate.hashCode() : 0);
        result = 31 * result + (actualOffBlockTime != null ? actualOffBlockTime.hashCode() : 0);
        result = 31 * result + (mainFlight != null ? mainFlight.hashCode() : 0);
        result = 31 * result + (publicFlightState != null ? publicFlightState.hashCode() : 0);
        result = 31 * result + (expectedTimeGateOpen != null ? expectedTimeGateOpen.hashCode() : 0);
        result = 31 * result + (route != null ? route.hashCode() : 0);
        result = 31 * result + (scheduleDate != null ? scheduleDate.hashCode() : 0);
        result = 31 * result + (flightName != null ? flightName.hashCode() : 0);
        result = 31 * result + (actualLandingTime != null ? actualLandingTime.hashCode() : 0);
        result = 31 * result + (schemaVersion != null ? schemaVersion.hashCode() : 0);
        return result;
    }
}
