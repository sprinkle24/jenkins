pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sprinkle24/ThemePark.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}