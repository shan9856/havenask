/*
 * Copyright 2014-present Alibaba Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#pragma once

#include "autil/legacy/jsonizable.h"
#include "iquan/jni/Iquan.h"

#include "ha3/isearch.h"

namespace isearch {
namespace turing {

class UdfConfig : public autil::legacy::Jsonizable {
public:
    void Jsonize(autil::legacy::Jsonizable::JsonWrapper& json) {
        json.Jsonize("recall_model", functionModels, functionModels);
        json.Jsonize("score_model", tvfModels, tvfModels);
    }
public:
    iquan::FunctionModels functionModels;
    iquan::TvfModels tvfModels;
};

} // namespace turing
} // namespace isearch