// package src.collections.map.ordenacao;

// import java.time.LocalDate;
// import java.time.Month;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.TreeMap;

// public class AgendaEventos {
//     private Map<LocalDate, Evento> eventosMap;

//     public AgendaEventos() {
//         this.eventosMap = new HashMap<>();
//     }

//     public void adicionarEvento(LocalDate date, String nome, String atracao) {
//         Evento evento = new Evento(nome, atracao);
//         eventosMap.put(date, evento);
//     }

//     public void exibirAgenda() {
//         Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
//         System.out.println(eventosTreeMap);
//     }

//     public void obterProximoEvento() {
//         // Set<LocalDate> dateSet = eventosMap.keySet();
//         // Collections<Evento> values = eventosMap.values();
//         // eventosMap.get();

//         LocalDate dataAtual = LocalDate.now();
//         LocalDate proximaData = null;
//         Evento proximoEvento = null;
//         Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
//         for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
//             if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
//                 proximaData = entry.getKey();
//                 proximoEvento = entry.getValue();
//                 System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         AgendaEventos agendaEventos = new AgendaEventos();
//         agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
//         agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 16), "Evento 2", "Atração 2");
//         agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 17), "Evento 3", "Atração 3");

//         agendaEventos.exibirAgenda();

//         agendaEventos.obterProximoEvento();
//     }
// }
