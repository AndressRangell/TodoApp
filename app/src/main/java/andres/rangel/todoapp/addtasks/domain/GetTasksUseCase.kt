package andres.rangel.todoapp.addtasks.domain

import andres.rangel.todoapp.addtasks.data.TaskRepository
import andres.rangel.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetTasksUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}