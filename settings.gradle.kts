pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    repositories{
        maven{
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/AmplifaiHealth/ImageProcessingLib")
            credentials{
                username = "AmplifaiHealth"
                password = "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"
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ImageProcessingApp"
include(":app")
include(":imageProcessingLib")
