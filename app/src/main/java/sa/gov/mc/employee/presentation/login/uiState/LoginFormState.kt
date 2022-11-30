package sa.gov.mc.employee.presentation.login.ui_state

data class LoginFormState (
    val userName:String="",
    val userNameError:String?="",
    val passWord:String="",
    val passWordError:String?="",
    val captcha:String="",
    val captchaError:String?="",
    val uid:String?=""
        )