package andres.rangel.todoapp.addtasks.domain

import andres.rangel.todoapp.addtasks.data.TaskRepository
import andres.rangel.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }
}