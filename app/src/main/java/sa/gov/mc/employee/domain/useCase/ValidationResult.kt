package sa.gov.mc.employee.domain.useCase

data class ValidationResult (
    val successful: Boolean,
    val errorMessage: String?= null

    )
