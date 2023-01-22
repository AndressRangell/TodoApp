package andres.rangel.todoapp.addtasks.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity(
    @PrimaryKey
    val id: Long,
    val task: String,
    var selected: Boolean = false
)
