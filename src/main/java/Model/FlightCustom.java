package Model;

import java.sql.Time;
import java.util.Date;

/**
 * Created by lm on 17.05.2017.
 */
public class FlightCustom {
    private Integer id;
    private String flightName;
    private Date scheduleDate;
    private String flightDirection;
    private Integer flightNumber;
    private String prefixIATA;
    private String prefixICAO;
    private Time scheduleTime;
    private String serviceType;
    private String mainFlight;
    private Date estimatedLandingTime;
    private Date actualLandingTime;
    private Integer terminal;
    private String gate;

    @Override
    public String toString() {
        return "FlightCustom{" +
                "id=" + id +
                ", flightName='" + flightName + '\'' +
                ", scheduleDate=" + scheduleDate +
                ", flightDirection='" + flightDirection + '\'' +
                ", flightNumber=" + flightNumber +
                ", prefixIATA='" + prefixIATA + '\'' +
                ", prefixICAO='" + prefixICAO + '\'' +
                ", scheduleTime=" + scheduleTime +
                ", serviceType='" + serviceType + '\'' +
                ", mainFlight='" + mainFlight + '\'' +
                ", estimatedLandingTime=" + estimatedLandingTime +
                ", actualLandingTime=" + actualLandingTime +
                ", terminal=" + terminal +
                ", gate='" + gate + '\'' +
                ", aircraftRegistration='" + aircraftRegistration + '\'' +
                '}';
    }

    public FlightCustom() {
    }

    public FlightCustom(Integer id, String flightName, Date scheduleDate, String flightDirection, Integer flightNumber, String prefixIATA, String prefixICAO, Time scheduleTime, String serviceType, String mainFlight, Date estimatedLandingTime, Date actualLandingTime, Integer terminal, String gate, String aircraftRegistration) {

        this.id = id;
        this.flightName = flightName;
        this.scheduleDate = scheduleDate;
        this.flightDirection = flightDirection;
        this.flightNumber = flightNumber;
        this.prefixIATA = prefixIATA;
        this.prefixICAO = prefixICAO;
        this.scheduleTime = scheduleTime;
        this.serviceType = serviceType;
        this.mainFlight = mainFlight;
        this.estimatedLandingTime = estimatedLandingTime;
        this.actualLandingTime = actualLandingTime;
        this.terminal = terminal;
        this.gate = gate;
        this.aircraftRegistration = aircraftRegistration;
    }

    private String aircraftRegistration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getFlightDirection() {
        return flightDirection;
    }

    public void setFlightDirection(String flightDirection) {
        this.flightDirection = flightDirection;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPrefixIATA() {
        return prefixIATA;
    }

    public void setPrefixIATA(String prefixIATA) {
        this.prefixIATA = prefixIATA;
    }

    public String getPrefixICAO() {
        return prefixICAO;
    }

    public void setPrefixICAO(String prefixICAO) {
        this.prefixICAO = prefixICAO;
    }

    public Time getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Time scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getMainFlight() {
        return mainFlight;
    }

    public void setMainFlight(String mainFlight) {
        this.mainFlight = mainFlight;
    }

    public Date getEstimatedLandingTime() {
        return estimatedLandingTime;
    }

    public void setEstimatedLandingTime(Date estimatedLandingTime) {
        this.estimatedLandingTime = estimatedLandingTime;
    }

    public Date getActualLandingTime() {
        return actualLandingTime;
    }

    public void setActualLandingTime(Date actualLandingTime) {
        this.actualLandingTime = actualLandingTime;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }
}
