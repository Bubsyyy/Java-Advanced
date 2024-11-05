

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import p06_TirePressureMonitoringSystem.Alarm;
import p06_TirePressureMonitoringSystem.Sensor;

public class AlarmTest {

    private static final double ALARMING_PRESSURE_VALUE = 15;
    private static final double CALM_PRESSURE_VALUE = 19;
    private Alarm alarm;
    private Sensor mockedSensor;

    @BeforeEach
    public void setup() {
        mockedSensor = Mockito.mock(Sensor.class);
        alarm = new Alarm(mockedSensor);
    }

    @Test
    public void testCheckCalmAlarm() {
        Mockito.when(mockedSensor.popNextPressurePsiValue()).thenReturn(CALM_PRESSURE_VALUE);
        alarm.check();
        Assertions.assertFalse(alarm.getAlarmOn());
    }

    @Test
    public void testCheckAlarming() {
        Mockito.when(mockedSensor.popNextPressurePsiValue()).thenReturn(ALARMING_PRESSURE_VALUE);
        alarm.check();
        Assertions.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testCheck(){
        alarm.check();
    }

    @Test
    public void testSensorPopPressureValue(){
        new Sensor().popNextPressurePsiValue();
    }
}
