//lalo_p
public class Queries {
    
    //Tabla mediciones
    static String todo = "SELECT * FROM mediciones";
    static String clave_estaciones = "SELECT clave FROM estaciones";
    static String por_estacion = "SELECT * FROM mediciones WHERE estaciones_clave = '%s' ORDER BY instante DESC";
    static String por_periodo = "SELECT * FROM mediciones WHERE  DATE (instante) BETWEEN '%s' AND '%s'";
    static String promedio_mens = "SELECT estaciones_clave AS estacion, MONTH(instante) AS mes, ROUND(AVG(temperatura),2) AS temperatura_prom FROM mediciones WHERE estaciones_clave = '%s' GROUP BY MONTH(instante)";
    static String max_min_semana = " SELECT estaciones_clave AS estacion, WEEK(instante) AS semana, ROUND(MIN(precipitacion),2) AS precipitacion_min, ROUND(MAX(precipitacion),2) AS precipitacion_max FROM mediciones WHERE estaciones_clave = '%s' GROUP BY WEEK(instante)";
    static String med_hoy = "SELECT * FROM mediciones WHERE instante >= CURRENT_DATE AND instante < CURRENT_DATE + INTERVAL 1 DAY AND estaciones_clave = '%s'";
    
    //Tabla Usuarios
    static String all = "SELECT * FROM usuarios";
    
}
