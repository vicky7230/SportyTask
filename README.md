# SportyProblem

## Setup Instructions

### API Key Configuration

This project requires an API key from NewsAPI.org to function properly. Follow these steps to set up your API key:

1. Visit [NewsAPI.org](https://newsapi.org/) and register for a free API key
2. Create or open the `local.properties` file in the root directory of the project
3. Add the following line to the file:
   ```
   API_KEY=your_actual_api_key
   ```
4. Replace `your_actual_api_key` with the API key you obtained from NewsAPI.org

**Important Notes:**
- The `local.properties` file should not be committed to version control (it's already in `.gitignore`)
- If you don't add the API key, the app will not be able to fetch news data
- The app uses this key for making requests to the NewsAPI.org endpoints

## Building the Project

After setting up your API key, you can build and run the project using Android Studio or Gradle commands.

```
./gradlew assembleDebug
```

Or simply run the app directly from Android Studio.

## Tech Stack

- Kotlin with Jetpack Compose
- Clean Architecture with MVVM
- Dagger for dependency injection
- Retrofit for network requests
- Coroutines for asynchronous operations

## License

MIT License

Copyright (c) 2025 SportyProblem

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

