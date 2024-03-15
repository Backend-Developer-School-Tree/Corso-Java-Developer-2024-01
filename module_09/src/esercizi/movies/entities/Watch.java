package module_09.src.esercizi.movies.entities;

import java.time.LocalDateTime;

// SELECT * FROM user, watch WHERE user.id = 1 AND user.id = watch.id_user;
// user.id, user.name, watch.id_user, watch.id_movie, watch.watch_date
// 1        Andrea     1              2               2024-03-15
// 1        Andrea     1              3               2024-02-27
// 1        Andrea     1              ...             ...
// ...      ...        ...            ...             ...
public class Watch
{
    int idUser;
    int idMovie;
    LocalDateTime watchDate;
}
